<template>
  <div>
    <!-- <div class="logo_box"><img class="logo_img" src="@/assets/images/logo.png"></div> -->
	<div class="login_box">
		<h1 class="title">欢迎登录</h1>
		<input class="input_box" type="text" placeholder="用户名">
		<input class="input_box" type="password" placeholder="密码">
		<input class="button_box" type="button" value="登录" @click="goconservayor()">
	</div>
  </div>
</template>

<script>
export default {
   name:'lo-gin',
   methods:{
    goconservayor(){
        this.$router.push('/conservator')
    }
   }
}
</script>

<style  scoped>
  body {
		background-color: #8ea4f8;
		background-image: url(@/assets/images/login.jpg);
		background-repeat: no-repeat;
		background-size: cover; 
 
	}
	.login_box {
		width: 400px;
		height: 400px;
		background-color: #fff;
		margin: auto;
		margin-top: 150px;
		border-radius: 5px;
		overflow: hidden;
	}
	.title {
		text-align: center;
		font-size: 28px;
		color: #000;
		margin-top: 80px;
		margin-bottom: 10px;
		letter-spacing: 3px;
		font-family: sans-serif;
	}
	.input_box {
		width: 300px;
		height: 30px;
		width: 300px;
		height: 40px;
		padding-left: 10px;
		margin-top: 20px;
		margin-left: 50px;
	}
	.button_box {
		width: 300px;
		height: 35px;
		width: 300px;
		height: 40px;
		margin-top: 20px;
		margin-left: 50px;
		border-radius: 5px;
		background-color: #64a9d9;
		cursor: pointer;
		color: #fff;
	}
	.logo_box {
		position: absolute;
		background-color: #fff;
		width: 100px;
		height: 100px;
		border-radius: 100px;
		top: 100px;
		left: 46%;
		border: solid 5px #A68364;
		text-align: center;
	}
	.logo_img {
		margin-top: 20px;
	}

</style>