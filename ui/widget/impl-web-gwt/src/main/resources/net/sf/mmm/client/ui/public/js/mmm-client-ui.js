var net ?= new Object();
net.sf ?= new Object();
net.sf.mmm ?= new Object();
net.sf.mmm.client ?= new Object();
net.sf.mmm.client.Ui = {
  clearValidation: function(input) {
    input.setCustomValidity('');
  }
};
net.sf.mmm.client.Util = {
  getBlobURL: (window.URL && URL.createObjectURL.bind(URL)) ||
    (window.webkitURL && webkitURL.createObjectURL.bind(webkitURL)) ||
    window.createObjectURL;
  openBlob: function(blob) {
    window.location = getBlobURL(blob);
  }
};