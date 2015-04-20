package lumstic.example.com.lumstic.Models;

/**
 * Created by work on 17/4/15.
 */
public class Categories {
    int id;
    int surveyId;
    int parentId;
    int orderNumber;
    int categoryId;
    String type;
    String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Categories(int id, int surveyId, int parentId, int orderNumber, int categoryId, String type) {
        this.id = id;
        this.surveyId = surveyId;
        this.parentId = parentId;
        this.orderNumber = orderNumber;
        this.categoryId = categoryId;
        this.type = type;
    }
}