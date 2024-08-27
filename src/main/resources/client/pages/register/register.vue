<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"440rpx 44rpx 244rpx 44rpx","background":"url(http://chy2.gdnxeco.com/20230914/53bc483ddc244b339a5bd89762602c53.jpg) no-repeat center top / 100%,#ffffff","height":"100%"}'>
		<view :style='{"padding":"48rpx 48rpx 24rpx 48rpx","boxShadow":"0px 0px 0px #dddddd","borderRadius":"0px","background":"none","display":"block","width":"100%","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0","borderRadius":"100%","objectFit":"cover","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #dddddd","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666666","borderRadius":"60rpx","background":"#ffffff","borderWidth":"0 0 2rpx 0","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.zhanghao" type="text" class="uni-input" name="" placeholder="账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #dddddd","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666666","borderRadius":"60rpx","background":"#ffffff","borderWidth":"0 0 2rpx 0","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #dddddd","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666666","borderRadius":"60rpx","background":"#ffffff","borderWidth":"0 0 2rpx 0","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima" type="password" class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #dddddd","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666666","borderRadius":"60rpx","background":"#ffffff","borderWidth":"0 0 2rpx 0","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghutouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"width":"160rpx","borderRadius":"16rpx","objectFit":"contain","display":"block","height":"160rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"160rpx","borderRadius":"16rpx","objectFit":"contain","display":"block","height":"160rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<picker :style='{"border":"2rpx solid #dddddd","padding":"0 20rpx 0 0","margin":"0 0 24rpx 0","borderRadius":"60rpx","background":"#ffffff","width":"100%","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuxingbieChange" :value="yonghuxingbieIndex" :range="yonghuxingbieOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<input :style='{"border":"2rpx solid #dddddd","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666666","borderRadius":"60rpx","background":"#ffffff","borderWidth":"0 0 2rpx 0","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
			</view>
			<picker :style='{"border":"2rpx solid #dddddd","padding":"0 20rpx 0 0","margin":"0 0 24rpx 0","borderRadius":"60rpx","background":"#ffffff","width":"100%","height":"auto"}' v-if="tableName=='yonghu'" mode="date" :value="ruleForm.shengri" @change="yonghushengriDateChange">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{ruleForm.shengri?ruleForm.shengri:"请选择生日"}}</view>
			</picker>
			<picker :style='{"border":"2rpx solid #dddddd","padding":"0 20rpx 0 0","margin":"0 0 24rpx 0","borderRadius":"60rpx","background":"#ffffff","width":"100%","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghusuozaichengshiChange" :value="yonghusuozaichengshiIndex" :range="yonghusuozaichengshiOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{ruleForm.suozaichengshi?ruleForm.suozaichengshi:"请选择所在城市"}}</view>
			</picker>
			<picker :style='{"border":"2rpx solid #dddddd","padding":"0 20rpx 0 0","margin":"0 0 24rpx 0","borderRadius":"60rpx","background":"#ffffff","width":"100%","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghuwodechongwuChange" :value="yonghuwodechongwuIndex" :range="yonghuwodechongwuOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{ruleForm.wodechongwu?ruleForm.wodechongwu:"请选择我的宠物"}}</view>
			</picker>
			<picker :style='{"border":"2rpx solid #dddddd","padding":"0 20rpx 0 0","margin":"0 0 24rpx 0","borderRadius":"60rpx","background":"#ffffff","width":"100%","height":"auto"}' v-if="tableName=='yonghu'"  @change="yonghugerenbiaoqianChange" :value="yonghugerenbiaoqianIndex" :range="yonghugerenbiaoqianOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input">{{ruleForm.gerenbiaoqian?ruleForm.gerenbiaoqian:"请选择个人标签"}}</view>
			</picker>
			<button :style='{"border":"0","padding":"0 0 0 0","margin":"0 0 24rpx 0","color":"#ffffff","borderRadius":"60rpx","background":"#a1d1ff","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                yonghuxingbieOptions: [],
                yonghuxingbieIndex: 0,
                yonghusuozaichengshiOptions: [],
                yonghusuozaichengshiIndex: 0,
                yonghuwodechongwuOptions: [],
                yonghuwodechongwuIndex: 0,
                yonghugerenbiaoqianOptions: [],
                yonghugerenbiaoqianIndex: 0,
				ruleForm: {
                zhanghao: '',
                xingming: '',
                mima: '',
                touxiang: '',
                xingbie: '',
                shouji: '',
                shengri: '',
                suozaichengshi: '',
                wodechongwu: '',
                gerenbiaoqian: '',
                wodejianjie: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

			// 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.yonghuxingbieOptions[0]
			}
			// 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghusuozaichengshiOptions = "昆明市".split(',');
				this.ruleForm.suozaichengshi=this.yonghusuozaichengshiOptions[0]
			}
			// 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghuwodechongwuOptions = "暂无,猫狗双全,狗狗,猫咪,其他异宠".split(',');
				this.ruleForm.wodechongwu=this.yonghuwodechongwuOptions[0]
			}
			// 自定义下拉框值
			if(this.tableName=='yonghu'){
                this.yonghugerenbiaoqianOptions = "暂无,爱心人士,资深救助人,救助站管理员".split(',');
				this.ruleForm.gerenbiaoqian=this.yonghugerenbiaoqianOptions[0]
			}
			
			this.styleChange()
		},
		methods: {

            yonghutouxiangTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.touxiang = 'file/' + res.file;
                    _this.$forceUpdate();
                });
            },
            // 下拉变化
            yonghuxingbieChange(e) {
                    this.yonghuxingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.yonghuxingbieOptions[this.yonghuxingbieIndex]
            },
            yonghushengriDateChange(e) {
                this.ruleForm.shengri = e.target.value;
                this.$forceUpdate();
            },
            // 下拉变化
            yonghusuozaichengshiChange(e) {
                    this.yonghusuozaichengshiIndex = e.target.value
                    this.ruleForm.suozaichengshi = this.yonghusuozaichengshiOptions[this.yonghusuozaichengshiIndex]
            },
            // 下拉变化
            yonghuwodechongwuChange(e) {
                    this.yonghuwodechongwuIndex = e.target.value
                    this.ruleForm.wodechongwu = this.yonghuwodechongwuOptions[this.yonghuwodechongwuIndex]
            },
            // 下拉变化
            yonghugerenbiaoqianChange(e) {
                    this.yonghugerenbiaoqianIndex = e.target.value
                    this.ruleForm.gerenbiaoqian = this.yonghugerenbiaoqianOptions[this.yonghugerenbiaoqianIndex]
            },
            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					document.querySelectorAll('.radioText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #eeeeee","outlineColor":"#666666","background":"#ffffff","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #C6EBF1","textAlign":"center","background":"#C6EBF1","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #eeeeee","borderColor":"#666666","borderRadius":"40rpx","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"borderColor":"#C6EBF1","color":"#ffffff","borderRadius":"40rpx","background":"#C6EBF1"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.zhanghao) && `yonghu` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `yonghu` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
                if(`yonghu` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
                    return
                }
				if(`yonghu` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
