<template>
  <div class="guanliyuan">
    <el-row class="tac">
      <el-col :span="12">
        <h5>管理员</h5>
        <el-menu
          :default-active="this.$route.path"
          router
          mode="horizontal"
          class="el-menu-vertical-demo"
          @open="handleOpen"
          @close="handleClose"
          background-color="#545c64"
          text-color="#fff"
          active-text-color="#ffd04b"
        >
          <!-- <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>导师管理</span>
            </template>
          </el-submenu> -->
          <el-menu-item v-for="(item, i) in navlist" :key="i" :index="item.name">
            <i class="el-icon-location"></i>
            <span slot="title">{{ item.navitem }}</span>
          </el-menu-item>
          <!-- <el-menu-item index="2">
            <i class="el-icon-menu"></i>
            <span slot="title">学生管理</span>
          </el-menu-item>
          <el-menu-item index="3">
            <i class="el-icon-document"></i>
            <span slot="title">课题审核</span>
          </el-menu-item>
          <el-menu-item index="4">
            <i class="el-icon-setting"></i>
            <span slot="title">公告管理</span>
          </el-menu-item>
          <el-menu-item index="5">
            <i class="el-icon-setting"></i>
            <span slot="title">修改信息</span>
          </el-menu-item> -->
        </el-menu>
      </el-col>
    </el-row>
    <!-- 列表展示 -->
    <!-- <div class="liebiao">
      <el-table
    :data="tableData"
    border
    style="width: 100%">

    <el-table-column
      prop="name"
      label="姓名"
      width="120">
    </el-table-column>
    <el-table-column
      prop="count"
      label="账号"
      width="120">
    </el-table-column>
    <el-table-column
      prop="password"
      label="密码"
      width="120">
    </el-table-column>
    
    <el-table-column
      fixed="right"
      label="操作"
      width="100">
      <template slot-scope="scope">
        <el-button @click="handleClick(scope.row)" type="text" size="small">删除</el-button>
        <el-button type="text" size="small">修改</el-button>
      </template>
    </el-table-column>
   
      </el-table>
      <div class="btn">
        <button>新增</button>
     </div>
      </div> -->
      
  </div>
</template>
<script>

  export default {
    name: "conser-vator",
    methods: {
      handleClick(row) {
        console.log(row);
      }
    },

    data() {
      return {
        // 导航菜单
        navlist:[
          {
            name:'/',
            navitem:'导师管理'
          },
          {
            name:'/student',
            navitem:'学生管理'
          },
          {
            name:'/task',
            navitem:'课题审核'
          },   
          {
            name:'/Announcement',
            navitem:'公告管理'
          },
          {
            name:'/modification',
            navitem:'修改信息'
          }
        ],
       
        
        tableData: [
          {
          name: '王小虎',
          count:1801060514,
          password:1525178094
        }, 
        {
          
          name: '王小虎',
          count:1801060514,
          password:1525178094
        }, 
        {
          
          name: '王小虎',
          count:1801060514,
          password:1525178094
        }, 
      ]
      }
    }
  }

</script>

<style  scoped>
.guanliyuan {
  display: flex;
}
.liebiao{
  margin-top: 56px;
  margin-left: 15px;
}
.liebiao .btn{
  margin-left: 400px;
  margin-top: 10px;
}

.el-menu-vertical-demo {
  height: 800px;
  width: 200px;
}
/* .el-submenu{
    width: 100px;
}
.el-dropdown-menu__item, .el-menu-item{
    width: 100px;
} */
</style>