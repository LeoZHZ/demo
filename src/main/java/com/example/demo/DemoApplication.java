package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;
import java.nio.file.*;

//@MapperScan(basePackages = {"com.example.demo.mapper.first","com.example.demo.mapper.second"})
@EnableTransactionManagement // 启注解事务管理
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, MybatisAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
    /*    // 获取文件系统的WatchService对象
        WatchService watchService = FileSystems.getDefault().newWatchService();
        // 注册监听器，监听指定目录下的ENTRY_CREATE事件
        Path path = Paths.get("D:\\FtpRoot\\imageLib\\000000\\image");
        path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        // 循环监听
        while (true) {
            // 获取下一个文件改动事件
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                // 判断是否是新文件创建事件
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    // 获取新文件的路径
                    Path filePath = ((WatchEvent<Path>) event).context();
                    // 进行操作
                    System.out.println("New file created: " + filePath);
                    //
                }
            }
            // 重置key
            boolean valid = key.reset();
            if (!valid) {
                break;
            }
        }*/
        SpringApplication.run(DemoApplication.class, args);

    }

}
