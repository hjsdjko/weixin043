(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-chongwuxinxi-add-or-update"],{"29b3":function(e,n,t){var i=t("fa72");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var r=t("4f06").default;r("0c26c4f2",i,!0,{sourceMap:!1,shadowMode:!1})},3762:function(e,n,t){"use strict";var i,r=function(){var e=this,n=e.$createElement,t=e._self._c||n;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[t("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物名称")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chongwumingcheng,placeholder:"宠物名称"},model:{value:e.ruleForm.chongwumingcheng,callback:function(n){e.$set(e.ruleForm,"chongwumingcheng",n)},expression:"ruleForm.chongwumingcheng"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.chongwutupianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物图片")]),e.ruleForm.chongwutupian?t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.chongwutupian.split(",")[0],mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),t("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物类型")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.chongwuleixingIndex,range:e.chongwuleixingOptions},on:{change:function(n){arguments[0]=n=e.$handleEvent(n),e.chongwuleixingChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.chongwuleixing?e.ruleForm.chongwuleixing:"请选择宠物类型"))])],1)],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物品种")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chongwupinzhong,placeholder:"宠物品种"},model:{value:e.ruleForm.chongwupinzhong,callback:function(n){e.$set(e.ruleForm,"chongwupinzhong",n)},expression:"ruleForm.chongwupinzhong"}})],1),t("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物性别")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.chongwuxingbieIndex,range:e.chongwuxingbieOptions},on:{change:function(n){arguments[0]=n=e.$handleEvent(n),e.chongwuxingbieChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.chongwuxingbie?e.ruleForm.chongwuxingbie:"请选择宠物性别"))])],1)],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物年龄")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chongwunianling,placeholder:"宠物年龄"},model:{value:e.ruleForm.chongwunianling,callback:function(n){e.$set(e.ruleForm,"chongwunianling",n)},expression:"ruleForm.chongwunianling"}})],1),t("v-uni-view",{staticClass:"select",style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("宠物状态")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.chongwuzhuangtaiIndex,range:e.chongwuzhuangtaiOptions},on:{change:function(n){arguments[0]=n=e.$handleEvent(n),e.chongwuzhuangtaiChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666666"}},[e._v(e._s(e.ruleForm.chongwuzhuangtai?e.ruleForm.chongwuzhuangtai:"请选择宠物状态"))])],1)],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("收藏数量")]),t("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.storeupnum,placeholder:"收藏数量"},model:{value:e.ruleForm.storeupnum,callback:function(n){e.$set(e.ruleForm,"storeupnum",n)},expression:"ruleForm.storeupnum"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("健康状况")]),t("v-uni-textarea",{style:{border:"0px solid #eeeeee",padding:"24rpx 24rpx 24rpx 24rpx",margin:"0 0 0 0",color:"#000000",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"240rpx"},attrs:{placeholder:"健康状况"},model:{value:e.ruleForm.jiankangzhuangkuang,callback:function(n){e.$set(e.ruleForm,"jiankangzhuangkuang",n)},expression:"ruleForm.jiankangzhuangkuang"}})],1),t("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#C6EBF130",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("领养条件")]),t("v-uni-textarea",{style:{border:"0px solid #eeeeee",padding:"24rpx 24rpx 24rpx 24rpx",margin:"0 0 0 0",color:"#000000",borderRadius:"8rpx",flex:"1",background:"none",fontSize:"28rpx",height:"240rpx"},attrs:{placeholder:"领养条件"},model:{value:e.ruleForm.lingyangtiaojian,callback:function(n){e.$set(e.ruleForm,"lingyangtiaojian",n)},expression:"ruleForm.lingyangtiaojian"}})],1),t("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[t("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#333",borderRadius:"8rpx",background:"#C6EBF1",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},o=[];t.d(n,"b",(function(){return r})),t.d(n,"c",(function(){return o})),t.d(n,"a",(function(){return i}))},"5a98":function(e,n,t){"use strict";var i=t("4ea4");Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0,t("a481"),t("c5f6"),t("f559"),t("456d"),t("ac6a"),t("28a5"),t("96cf");var r=i(t("3b8d")),o=i(t("e2b1")),a=i(t("064f")),u=i(t("bd56")),c={data:function(){return{cross:"",ruleForm:{chongwumingcheng:"",chongwutupian:"",chongwuleixing:"",chongwupinzhong:"",chongwuxingbie:"",chongwunianling:"",jiankangzhuangkuang:"",lingyangtiaojian:"",chongwuzhuangtai:"未领养",storeupnum:"0"},chongwuleixingOptions:[],chongwuleixingIndex:0,chongwuxingbieOptions:[],chongwuxingbieIndex:0,chongwuzhuangtaiOptions:[],chongwuzhuangtaiIndex:0,user:{},ro:{chongwumingcheng:!1,chongwutupian:!1,chongwuleixing:!1,chongwupinzhong:!1,chongwuxingbie:!1,chongwunianling:!1,jiankangzhuangkuang:!1,lingyangtiaojian:!1,chongwuzhuangtai:!1,storeupnum:!1}}},components:{wPicker:o.default,xiaEditor:a.default,multipleSelect:u.default},watch:{},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(n){var t,i,r,o;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:return i=e.sent,this.user=i.data,e.next=7,this.$api.option("chongwufenlei","chongwuleixing",{});case 7:if(i=e.sent,this.chongwuleixingOptions=i.data,this.chongwuleixingOptions.unshift("请选择宠物类型"),this.chongwuxingbieOptions="公,母".split(","),this.chongwuzhuangtaiOptions="已领养,未领养".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),n.refid&&(this.ruleForm.refid=n.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!n.id){e.next=20;break}return this.ruleForm.id=n.id,e.next=18,this.$api.info("chongwuxinxi",this.ruleForm.id);case 18:i=e.sent,this.ruleForm=i.data;case 20:if(this.cross=n.cross,!n.cross){e.next=68;break}r=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(r);case 24:if((e.t1=e.t0()).done){e.next=68;break}if(o=e.t1.value,"chongwumingcheng"!=o){e.next=30;break}return this.ruleForm.chongwumingcheng=r[o],this.ro.chongwumingcheng=!0,e.abrupt("continue",24);case 30:if("chongwutupian"!=o){e.next=34;break}return this.ruleForm.chongwutupian=r[o].split(",")[0],this.ro.chongwutupian=!0,e.abrupt("continue",24);case 34:if("chongwuleixing"!=o){e.next=38;break}return this.ruleForm.chongwuleixing=r[o],this.ro.chongwuleixing=!0,e.abrupt("continue",24);case 38:if("chongwupinzhong"!=o){e.next=42;break}return this.ruleForm.chongwupinzhong=r[o],this.ro.chongwupinzhong=!0,e.abrupt("continue",24);case 42:if("chongwuxingbie"!=o){e.next=46;break}return this.ruleForm.chongwuxingbie=r[o],this.ro.chongwuxingbie=!0,e.abrupt("continue",24);case 46:if("chongwunianling"!=o){e.next=50;break}return this.ruleForm.chongwunianling=r[o],this.ro.chongwunianling=!0,e.abrupt("continue",24);case 50:if("jiankangzhuangkuang"!=o){e.next=54;break}return this.ruleForm.jiankangzhuangkuang=r[o],this.ro.jiankangzhuangkuang=!0,e.abrupt("continue",24);case 54:if("lingyangtiaojian"!=o){e.next=58;break}return this.ruleForm.lingyangtiaojian=r[o],this.ro.lingyangtiaojian=!0,e.abrupt("continue",24);case 58:if("chongwuzhuangtai"!=o){e.next=62;break}return this.ruleForm.chongwuzhuangtai=r[o],this.ro.chongwuzhuangtai=!0,e.abrupt("continue",24);case 62:if("storeupnum"!=o){e.next=66;break}return this.ruleForm.storeupnum=r[o],this.ro.storeupnum=!0,e.abrupt("continue",24);case 66:e.next=24;break;case 68:this.styleChange(),this.$forceUpdate();case 70:case"end":return e.stop()}}),e,this)})));function n(n){return e.apply(this,arguments)}return n}(),methods:{styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var n={color:"#666666"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var n={color:"#00babd"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var n={color:"#666666"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var n={color:"#00babd"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var n={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var n={border:"2rpx solid #00babd",borderRadius:"100%",background:"#19d2d5"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var n={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var n={border:"2rpx solid #00babd",color:"#ffffff",borderRadius:"100%",background:"#19d2d5"};Object.keys(n).forEach((function(t){e.style[t]=n[t]}))}))}))},chongwuleixingChange:function(e){this.chongwuleixingIndex=e.target.value,this.ruleForm.chongwuleixing=this.chongwuleixingOptions[this.chongwuleixingIndex]},chongwuxingbieChange:function(e){this.chongwuxingbieIndex=e.target.value,this.ruleForm.chongwuxingbie=this.chongwuxingbieOptions[this.chongwuxingbieIndex]},chongwuzhuangtaiChange:function(e){this.chongwuzhuangtaiIndex=e.target.value,this.ruleForm.chongwuzhuangtai=this.chongwuzhuangtaiOptions[this.chongwuzhuangtaiIndex]},chongwutupianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.chongwutupian="file/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var n,t,i,r,o,a,u,c,s,l;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.chongwumingcheng){e.next=3;break}return this.$utils.msg("宠物名称不能为空"),e.abrupt("return");case 3:if(this.ruleForm.chongwuxingbie){e.next=6;break}return this.$utils.msg("宠物性别不能为空"),e.abrupt("return");case 6:if(!this.ruleForm.storeupnum||this.$validate.isIntNumer(this.ruleForm.storeupnum)){e.next=9;break}return this.$utils.msg("收藏数量应输入整数"),e.abrupt("return");case 9:if(!this.cross){e.next=26;break}if(uni.setStorageSync("crossCleanType",!0),o=uni.getStorageSync("statusColumnName"),a=uni.getStorageSync("statusColumnValue"),""==o){e.next=26;break}if(n||(n=uni.getStorageSync("crossObj")),o.startsWith("[")){e.next=22;break}for(u in n)u==o&&(n[u]=a);return c=uni.getStorageSync("crossTable"),e.next=20,this.$api.update("".concat(c),n);case 20:e.next=26;break;case 22:t=Number(uni.getStorageSync("userid")),i=n["id"],r=uni.getStorageSync("statusColumnName"),r=r.replace(/\[/,"").replace(/\]/,"");case 26:if(!i||!t){e.next=49;break}return this.ruleForm.crossuserid=t,this.ruleForm.crossrefid=i,s={page:1,limit:10,crossuserid:t,crossrefid:i},e.next=32,this.$api.list("chongwuxinxi",s);case 32:if(l=e.sent,!(l.data.total>=r)){e.next=39;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 39:if(!this.ruleForm.id){e.next=44;break}return e.next=42,this.$api.update("chongwuxinxi",this.ruleForm);case 42:e.next=46;break;case 44:return e.next=46,this.$api.add("chongwuxinxi",this.ruleForm);case 46:this.$utils.msgBack("提交成功");case 47:e.next=57;break;case 49:if(!this.ruleForm.id){e.next=54;break}return e.next=52,this.$api.update("chongwuxinxi",this.ruleForm);case 52:e.next=56;break;case 54:return e.next=56,this.$api.add("chongwuxinxi",this.ruleForm);case 56:this.$utils.msgBack("提交成功");case 57:case"end":return e.stop()}}),e,this)})));function n(){return e.apply(this,arguments)}return n}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),i=n.getMonth()+1,r=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,r=r>9?r:"0"+r,"".concat(t,"-").concat(i,"-").concat(r)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c},"5b68":function(e,n,t){"use strict";var i=t("29b3"),r=t.n(i);r.a},9531:function(e,n,t){"use strict";t.r(n);var i=t("3762"),r=t("f533");for(var o in r)"default"!==o&&function(e){t.d(n,e,(function(){return r[e]}))}(o);t("5b68");var a,u=t("f0c5"),c=Object(u["a"])(r["default"],i["b"],i["c"],!1,null,"27ea773e",null,!1,i["a"],a);n["default"]=c.exports},f533:function(e,n,t){"use strict";t.r(n);var i=t("5a98"),r=t.n(i);for(var o in i)"default"!==o&&function(e){t.d(n,e,(function(){return i[e]}))}(o);n["default"]=r.a},fa72:function(e,n,t){var i=t("24fb");n=i(!1),n.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-27ea773e]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=n}}]);