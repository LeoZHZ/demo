
# 佛山-美和额外接口

### HIS自动登记、骨密度PDF报告转换、文件合并、重传云平台判断机制、一些统计报表的处理

* HIS自动登记：添加v_exams\v_sub_exam\v_sub_exam_item\exams\exam_item\exam_patient\his_insert_flag
* 骨密度：将服务器上的骨密度的DICOM的PDF文件转成普通PDF文件后回传
* 文件合并：通过file_remove表将同检查不同项目（uid )合并到同个文件夹下
* 重传平台机制：通过rec_load表进行判断，判断云平台收到的文件和服务器上的文件数量是否一致，至少平台的文件需要比服务器上的多，如果少了则重传
* 统计报表：一些报表统计的定期更新插入到统计表中
