package org.yoqu.story.admin.restController;

import org.hsweb.web.bean.po.GenericPo;
import org.hsweb.web.controller.GenericController;
import org.hsweb.web.core.authorize.annotation.Authorize;
import org.hsweb.web.core.logger.annotation.AccessLogger;
import org.hsweb.web.core.message.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yoqu.common.entity.rule.StoryRulePo;
import org.yoqu.common.entity.rule.StorySiteRulePo;
import org.yoqu.story.dao.service.StoryRuleService;
import org.yoqu.story.dao.service.StorySiteRuleService;


/**
 * Created by Admin on 2017/6/10.
 */

@RestController
@RequestMapping("api/site/story")
@Authorize(module = "storyRule") //权限验证
@AccessLogger("小说网站管理")   //访问日志描述
public class StoryRestController extends GenericController<StorySiteRulePo, String> {

    @Autowired
    StorySiteRuleService storySiteRuleService;

    @Autowired
    StoryRuleService storyRuleService;

    @Override
    protected StorySiteRuleService getService() {
        return this.storySiteRuleService;
    }


    @RequestMapping(
            value = {"save"},
            method = {RequestMethod.POST}
    )
    @AccessLogger("修改")
    public ResponseMessage save(@RequestBody StorySiteRulePo object) {
        String poId = storySiteRuleService.save(object);
        if(null != object.getStoryRulePos()){
            for (StoryRulePo storyRulePo : object.getStoryRulePos()){
                if(null == storyRulePo.getStorySiteRuleId()){
                    storyRulePo.setStorySiteRuleId(poId);
                }
                storyRuleService.save(storyRulePo);
            }
        }
        return ResponseMessage.ok(poId==null?0:1);
    }


}