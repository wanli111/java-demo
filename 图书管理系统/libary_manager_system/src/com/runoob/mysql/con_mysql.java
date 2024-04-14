package com.runoob.mysql;

public class con_mysql {
    public class jdbcDemo01 {
        public static void main(String[] args) throws Exception {
            Statement state = null;
            Connection conn = null;
            try {
                //2.注册驱动
                Class.forName("com.mysql.cj.jdbc.Driver");

                //3.获取数据库连接对象
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zqq?serverTimezone=GMT%2B8", "root", "root");

                //4.定义sql语句
                String sql = "update integral set stu_name='老黄666' where id = '1'";

                //5.获取执行sql的对象 Statement
                state = conn.createStatement();

                //执行sql
                int count = state.executeUpdate(sql);

                //7.处理结果
                System.out.println(count);
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {

                try {
                    if (state!=null){
                        //8.释放资源
                        state.close();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

                try {
                    if (conn!=null){
                        conn.close();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
