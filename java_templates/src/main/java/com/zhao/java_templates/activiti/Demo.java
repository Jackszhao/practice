package com.zhao.java_templates.activiti;

import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

public class Demo {
    /****
     * 创建流程表
     * */
    @Test
    public void createTable() {
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
                .buildProcessEngine();
        System.out.println("------processEngine:" + processEngine);
    }
    /****
     * 部署流程
     * */
    @Test
    public void deploy() throws Exception {
        //获取流程引擎
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //获取仓库服务的实例
        Deployment deployment = processEngine.getRepositoryService ( )
                .createDeployment ( )
                .addClasspathResource("process/leave.bpmn20.xml")
                .name("请假")
                .deploy();
        System.out.println("请假部署id："+deployment.getId());
    }

    @Test
    public void start(){
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        RuntimeService runtimeService = defaultProcessEngine.getRuntimeService();
        ProcessInstance myProcess_1 = runtimeService.startProcessInstanceByKey("myProcess_1");
        System.out.println("流程实例id;"+myProcess_1.getId());
        System.out.println("流程定义id;"+myProcess_1.getProcessDefinitionId());
    }


    @Test
    public void complete(){
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
        TaskService taskService = defaultProcessEngine.getTaskService();
        taskService.complete("5002");
    }
}
