package org.wlgzs.index_evaluation.service;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.wlgzs.index_evaluation.pojo.EmployerSatisfaction;

import java.io.IOException;
import java.util.List;

/**
 * @author 武凯焱
 * @date 2019/1/14 8:09
 * @Description:
 */
public interface EmployerSatisfactionService extends IService<EmployerSatisfaction> {
    @Transactional
    //导入excel表
    List<EmployerSatisfaction> importExcel(MultipartFile file,String year)throws IOException;
    //数据添加到数据库
    @Transactional
    boolean add(List<EmployerSatisfaction> employerSatisfactions);

}