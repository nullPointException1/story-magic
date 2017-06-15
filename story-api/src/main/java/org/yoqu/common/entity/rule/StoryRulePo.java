package org.yoqu.common.entity.rule;

import org.hibernate.validator.constraints.NotEmpty;
import org.hsweb.web.bean.po.GenericPo;
import org.yoqu.common.enums.DragRuleTypeEnum;


/**
 * Created by Kai on 2017/6/9.
 *
 * @Email zack.zhong@qq.com
 */
public class StoryRulePo extends BaseRulePo {

    /**
     * 规则名称
     */
    @NotEmpty
    private String name;

    /**
     * 书籍名字规则
     */
    @NotEmpty
    private String bookName;

    /**
     * 作者名字规则
     */
    @NotEmpty
    private String authorName;

    /**
     * 类型
     */
    @NotEmpty
    private String type;

    /**
     * 列表规则
     */
    private String listRule;

    /**
     * 章节名字规则
     */
    private String chapterName;

    /**
     * 页面url
     */
    @NotEmpty
    private String url;

    /**
     * 详情规则
     */
    private String urlRule;

    /**
     * 资源网站名称规则
     */
    private String resourceSiteRule;

    /**
     * 资源网站Url规则
     */
    private String resourceSiteUrlRule;

    /**
     * 最后更新时间获取规则
     */
    private String lastUpdateRule;

    /**
     * 规则类型
     */
    private DragRuleTypeEnum ruleType;

    /**
     * 封面
     */
    private String albumUrl;

    /**
     * Site 表ID
     */
    @NotEmpty
    private String storySiteRuleId;

    public String getLastUpdateRule() {
        return lastUpdateRule;
    }

    public void setLastUpdateRule(String lastUpdateRule) {
        this.lastUpdateRule = lastUpdateRule;
    }

    public String getResourceSiteRule() {
        return resourceSiteRule;
    }

    public void setResourceSiteRule(String resourceSiteRule) {
        this.resourceSiteRule = resourceSiteRule;
    }

    public String getResourceSiteUrlRule() {
        return resourceSiteUrlRule;
    }

    public void setResourceSiteUrlRule(String resourceSiteUrlRule) {
        this.resourceSiteUrlRule = resourceSiteUrlRule;
    }

    public String getUrlRule() {
        return urlRule;
    }

    public void setUrlRule(String urlRule) {
        this.urlRule = urlRule;
    }


	public String getName() {
		return name;
	}

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getListRule() {
        return listRule;
    }

    public void setListRule(String listRule) {
        this.listRule = listRule;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DragRuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(DragRuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public String getAlbumUrl() {
        return albumUrl;
    }

    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    public String getStorySiteRuleId() {
        return storySiteRuleId;
    }

    public void setStorySiteRuleId(String storySiteRuleId) {
        this.storySiteRuleId = storySiteRuleId;
    }


	public interface Property extends GenericPo.Property{

        String name = "name";

        String bookName = "bookName";

        String authorName = "authorName";

        String type = "type";

        String listRule = "listRule";

        String chapterName = "chapterName";

        String url = "url";

		String ruleType = "ruleType";

		String albumUrl = "albumUrl";

		String urlRule = "urlRule";

        String resourceSiteRule = "resourceSiteRule";

        String resourceSiteUrlRule = "resourceSiteUrlRule";

        String lastUpdateRule = "lastUpdateRule";

        String storySiteRuleId = "storySiteRuleId";


	}

}
