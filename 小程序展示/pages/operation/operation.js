// pages/operation/operation.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    areaId: undefined,
            
    areaName: '',
    priority: '',
    addUrl: "http://localhost:8888/wx/superadmin/addarea",
    modifyUrl:"http://localhost:8888/wx/superadmin/modifyarea"

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that  = this;
    if (options.areaId == undefined) {
      return;
    }
    this.setData({
      areaId: options.areaId
    });
   
    wx.request({
      url: 'http://localhost:8888/wx/superadmin/getareabyid',
      data: {"areaId": options.areaId},
      method: 'GET',
      success: function(res){
        var area = res.data.area;
        if(area == undefined){
          var toastText = "获取数据失败"+ res.data.errMsg;
          wx.showToast({
            title: toastText,
            icon:'',
            duration:2000
          });
        }else{
          that.setData({
            areaName: area.areaName,
            priority: area.priority
          });
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

formSubmit: function(e){
  var that = this;
  var formData = e.detail.value;
  var url = that.data.addUrl;
  var flag = true;
  if(that.data.areaId != undefined){
    formData.areaId = that.data.areaId;
    url = that.data.modifyUrl;
   
  }
  wx.request({
    url: url,
    data: JSON.stringify(formData),
    method:'POST',
    header: {
      'Contend-Type': 'application/json'
    },
    success: function(res){
      var result = res.data.success;
      var toastText = '操作成功';
      
      if(result != true){
        toastText = "操作失败:"+res.data.errMsg;
        flag = false;
      }
      wx.showToast({
        title: toastText,
        icon:'',
        duration:2000,
        success: function(){
          if(flag){
            setTimeout(function () {
              wx.redirectTo({
                url: '../list/list'
              })
            }, 2000);
          }
        }
      });
      
      // if(that.data.areaId == undefined){
      //   wx.redirectTo({
      //     url: '../list/list',
      //   })
      // }
      // //为了在成功修改之后跳转到list页面
      //  if(that.data.areaId!=undefined && flag){
      //      setTimeout(function(){
      //         wx.redirectTo({
      //           url: '../list/list'
      //         })
      //       },2000);
      //    }
    }


  })
}







})