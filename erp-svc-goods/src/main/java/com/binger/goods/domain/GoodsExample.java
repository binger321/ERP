package com.binger.goods.domain;

import java.math.BigDecimal;
import java.util.*;

public class GoodsExample {
    /**
     * goods
     */
    protected String orderByClause;

    /**
     * goods
     */
    protected boolean distinct;

    /**
     * goods
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    private SelectiveField selectiveField;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
        selectiveField = SelectiveField.select();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public SelectiveField getSelectiveField() {
        return this.selectiveField;
    }

    public void setSelectiveField(SelectiveField selectiveField) {
        this.selectiveField = selectiveField;
    }

    /**
     * goods 2017-12-13
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameIsNull() {
            addCriterion("goods_en_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameIsNotNull() {
            addCriterion("goods_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameEqualTo(String value) {
            addCriterion("goods_en_name =", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameNotEqualTo(String value) {
            addCriterion("goods_en_name <>", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameGreaterThan(String value) {
            addCriterion("goods_en_name >", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_en_name >=", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameLessThan(String value) {
            addCriterion("goods_en_name <", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameLessThanOrEqualTo(String value) {
            addCriterion("goods_en_name <=", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameLike(String value) {
            addCriterion("goods_en_name like", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameNotLike(String value) {
            addCriterion("goods_en_name not like", value, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameIn(List<String> values) {
            addCriterion("goods_en_name in", values, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameNotIn(List<String> values) {
            addCriterion("goods_en_name not in", values, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameBetween(String value1, String value2) {
            addCriterion("goods_en_name between", value1, value2, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andGoodsEnNameNotBetween(String value1, String value2) {
            addCriterion("goods_en_name not between", value1, value2, "goodsEnName");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIsNull() {
            addCriterion("main_img_url is null");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIsNotNull() {
            addCriterion("main_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlEqualTo(String value) {
            addCriterion("main_img_url =", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotEqualTo(String value) {
            addCriterion("main_img_url <>", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlGreaterThan(String value) {
            addCriterion("main_img_url >", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("main_img_url >=", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLessThan(String value) {
            addCriterion("main_img_url <", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLessThanOrEqualTo(String value) {
            addCriterion("main_img_url <=", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlLike(String value) {
            addCriterion("main_img_url like", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotLike(String value) {
            addCriterion("main_img_url not like", value, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlIn(List<String> values) {
            addCriterion("main_img_url in", values, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotIn(List<String> values) {
            addCriterion("main_img_url not in", values, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlBetween(String value1, String value2) {
            addCriterion("main_img_url between", value1, value2, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andMainImgUrlNotBetween(String value1, String value2) {
            addCriterion("main_img_url not between", value1, value2, "mainImgUrl");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdIsNull() {
            addCriterion("category_one_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdIsNotNull() {
            addCriterion("category_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdEqualTo(Integer value) {
            addCriterion("category_one_id =", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdNotEqualTo(Integer value) {
            addCriterion("category_one_id <>", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdGreaterThan(Integer value) {
            addCriterion("category_one_id >", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_one_id >=", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdLessThan(Integer value) {
            addCriterion("category_one_id <", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_one_id <=", value, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdIn(List<Integer> values) {
            addCriterion("category_one_id in", values, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdNotIn(List<Integer> values) {
            addCriterion("category_one_id not in", values, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdBetween(Integer value1, Integer value2) {
            addCriterion("category_one_id between", value1, value2, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryOneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_one_id not between", value1, value2, "categoryOneId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIsNull() {
            addCriterion("category_two_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIsNotNull() {
            addCriterion("category_two_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdEqualTo(Integer value) {
            addCriterion("category_two_id =", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotEqualTo(Integer value) {
            addCriterion("category_two_id <>", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdGreaterThan(Integer value) {
            addCriterion("category_two_id >", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_two_id >=", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLessThan(Integer value) {
            addCriterion("category_two_id <", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_two_id <=", value, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdIn(List<Integer> values) {
            addCriterion("category_two_id in", values, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotIn(List<Integer> values) {
            addCriterion("category_two_id not in", values, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdBetween(Integer value1, Integer value2) {
            addCriterion("category_two_id between", value1, value2, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryTwoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_two_id not between", value1, value2, "categoryTwoId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdIsNull() {
            addCriterion("category_three_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdIsNotNull() {
            addCriterion("category_three_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdEqualTo(Integer value) {
            addCriterion("category_three_id =", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdNotEqualTo(Integer value) {
            addCriterion("category_three_id <>", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdGreaterThan(Integer value) {
            addCriterion("category_three_id >", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_three_id >=", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdLessThan(Integer value) {
            addCriterion("category_three_id <", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_three_id <=", value, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdIn(List<Integer> values) {
            addCriterion("category_three_id in", values, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdNotIn(List<Integer> values) {
            addCriterion("category_three_id not in", values, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdBetween(Integer value1, Integer value2) {
            addCriterion("category_three_id between", value1, value2, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryThreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_three_id not between", value1, value2, "categoryThreeId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdIsNull() {
            addCriterion("category_four_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdIsNotNull() {
            addCriterion("category_four_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdEqualTo(Integer value) {
            addCriterion("category_four_id =", value, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdNotEqualTo(Integer value) {
            addCriterion("category_four_id <>", value, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdGreaterThan(Integer value) {
            addCriterion("category_four_id >", value, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_four_id >=", value, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdLessThan(Integer value) {
            addCriterion("category_four_id <", value, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_four_id <=", value, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdIn(List<Integer> values) {
            addCriterion("category_four_id in", values, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdNotIn(List<Integer> values) {
            addCriterion("category_four_id not in", values, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdBetween(Integer value1, Integer value2) {
            addCriterion("category_four_id between", value1, value2, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andCategoryFourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_four_id not between", value1, value2, "categoryFourId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andIsProductionIsNull() {
            addCriterion("is_production is null");
            return (Criteria) this;
        }

        public Criteria andIsProductionIsNotNull() {
            addCriterion("is_production is not null");
            return (Criteria) this;
        }

        public Criteria andIsProductionEqualTo(Integer value) {
            addCriterion("is_production =", value, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionNotEqualTo(Integer value) {
            addCriterion("is_production <>", value, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionGreaterThan(Integer value) {
            addCriterion("is_production >", value, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_production >=", value, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionLessThan(Integer value) {
            addCriterion("is_production <", value, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionLessThanOrEqualTo(Integer value) {
            addCriterion("is_production <=", value, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionIn(List<Integer> values) {
            addCriterion("is_production in", values, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionNotIn(List<Integer> values) {
            addCriterion("is_production not in", values, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionBetween(Integer value1, Integer value2) {
            addCriterion("is_production between", value1, value2, "isProduction");
            return (Criteria) this;
        }

        public Criteria andIsProductionNotBetween(Integer value1, Integer value2) {
            addCriterion("is_production not between", value1, value2, "isProduction");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkIsNull() {
            addCriterion("purchase_link is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkIsNotNull() {
            addCriterion("purchase_link is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkEqualTo(String value) {
            addCriterion("purchase_link =", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkNotEqualTo(String value) {
            addCriterion("purchase_link <>", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkGreaterThan(String value) {
            addCriterion("purchase_link >", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_link >=", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkLessThan(String value) {
            addCriterion("purchase_link <", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkLessThanOrEqualTo(String value) {
            addCriterion("purchase_link <=", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkLike(String value) {
            addCriterion("purchase_link like", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkNotLike(String value) {
            addCriterion("purchase_link not like", value, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkIn(List<String> values) {
            addCriterion("purchase_link in", values, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkNotIn(List<String> values) {
            addCriterion("purchase_link not in", values, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkBetween(String value1, String value2) {
            addCriterion("purchase_link between", value1, value2, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andPurchaseLinkNotBetween(String value1, String value2) {
            addCriterion("purchase_link not between", value1, value2, "purchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkIsNull() {
            addCriterion("same_purchase_link is null");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkIsNotNull() {
            addCriterion("same_purchase_link is not null");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkEqualTo(String value) {
            addCriterion("same_purchase_link =", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkNotEqualTo(String value) {
            addCriterion("same_purchase_link <>", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkGreaterThan(String value) {
            addCriterion("same_purchase_link >", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkGreaterThanOrEqualTo(String value) {
            addCriterion("same_purchase_link >=", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkLessThan(String value) {
            addCriterion("same_purchase_link <", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkLessThanOrEqualTo(String value) {
            addCriterion("same_purchase_link <=", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkLike(String value) {
            addCriterion("same_purchase_link like", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkNotLike(String value) {
            addCriterion("same_purchase_link not like", value, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkIn(List<String> values) {
            addCriterion("same_purchase_link in", values, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkNotIn(List<String> values) {
            addCriterion("same_purchase_link not in", values, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkBetween(String value1, String value2) {
            addCriterion("same_purchase_link between", value1, value2, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andSamePurchaseLinkNotBetween(String value1, String value2) {
            addCriterion("same_purchase_link not between", value1, value2, "samePurchaseLink");
            return (Criteria) this;
        }

        public Criteria andStyleIdIsNull() {
            addCriterion("style_id is null");
            return (Criteria) this;
        }

        public Criteria andStyleIdIsNotNull() {
            addCriterion("style_id is not null");
            return (Criteria) this;
        }

        public Criteria andStyleIdEqualTo(Integer value) {
            addCriterion("style_id =", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotEqualTo(Integer value) {
            addCriterion("style_id <>", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdGreaterThan(Integer value) {
            addCriterion("style_id >", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("style_id >=", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLessThan(Integer value) {
            addCriterion("style_id <", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdLessThanOrEqualTo(Integer value) {
            addCriterion("style_id <=", value, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdIn(List<Integer> values) {
            addCriterion("style_id in", values, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotIn(List<Integer> values) {
            addCriterion("style_id not in", values, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdBetween(Integer value1, Integer value2) {
            addCriterion("style_id between", value1, value2, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("style_id not between", value1, value2, "styleId");
            return (Criteria) this;
        }

        public Criteria andStyleOneIsNull() {
            addCriterion("style_one is null");
            return (Criteria) this;
        }

        public Criteria andStyleOneIsNotNull() {
            addCriterion("style_one is not null");
            return (Criteria) this;
        }

        public Criteria andStyleOneEqualTo(String value) {
            addCriterion("style_one =", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneNotEqualTo(String value) {
            addCriterion("style_one <>", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneGreaterThan(String value) {
            addCriterion("style_one >", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneGreaterThanOrEqualTo(String value) {
            addCriterion("style_one >=", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneLessThan(String value) {
            addCriterion("style_one <", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneLessThanOrEqualTo(String value) {
            addCriterion("style_one <=", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneLike(String value) {
            addCriterion("style_one like", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneNotLike(String value) {
            addCriterion("style_one not like", value, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneIn(List<String> values) {
            addCriterion("style_one in", values, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneNotIn(List<String> values) {
            addCriterion("style_one not in", values, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneBetween(String value1, String value2) {
            addCriterion("style_one between", value1, value2, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleOneNotBetween(String value1, String value2) {
            addCriterion("style_one not between", value1, value2, "styleOne");
            return (Criteria) this;
        }

        public Criteria andStyleTwoIsNull() {
            addCriterion("style_two is null");
            return (Criteria) this;
        }

        public Criteria andStyleTwoIsNotNull() {
            addCriterion("style_two is not null");
            return (Criteria) this;
        }

        public Criteria andStyleTwoEqualTo(String value) {
            addCriterion("style_two =", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoNotEqualTo(String value) {
            addCriterion("style_two <>", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoGreaterThan(String value) {
            addCriterion("style_two >", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoGreaterThanOrEqualTo(String value) {
            addCriterion("style_two >=", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoLessThan(String value) {
            addCriterion("style_two <", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoLessThanOrEqualTo(String value) {
            addCriterion("style_two <=", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoLike(String value) {
            addCriterion("style_two like", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoNotLike(String value) {
            addCriterion("style_two not like", value, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoIn(List<String> values) {
            addCriterion("style_two in", values, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoNotIn(List<String> values) {
            addCriterion("style_two not in", values, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoBetween(String value1, String value2) {
            addCriterion("style_two between", value1, value2, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleTwoNotBetween(String value1, String value2) {
            addCriterion("style_two not between", value1, value2, "styleTwo");
            return (Criteria) this;
        }

        public Criteria andStyleThreeIsNull() {
            addCriterion("style_three is null");
            return (Criteria) this;
        }

        public Criteria andStyleThreeIsNotNull() {
            addCriterion("style_three is not null");
            return (Criteria) this;
        }

        public Criteria andStyleThreeEqualTo(String value) {
            addCriterion("style_three =", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeNotEqualTo(String value) {
            addCriterion("style_three <>", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeGreaterThan(String value) {
            addCriterion("style_three >", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeGreaterThanOrEqualTo(String value) {
            addCriterion("style_three >=", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeLessThan(String value) {
            addCriterion("style_three <", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeLessThanOrEqualTo(String value) {
            addCriterion("style_three <=", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeLike(String value) {
            addCriterion("style_three like", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeNotLike(String value) {
            addCriterion("style_three not like", value, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeIn(List<String> values) {
            addCriterion("style_three in", values, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeNotIn(List<String> values) {
            addCriterion("style_three not in", values, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeBetween(String value1, String value2) {
            addCriterion("style_three between", value1, value2, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleThreeNotBetween(String value1, String value2) {
            addCriterion("style_three not between", value1, value2, "styleThree");
            return (Criteria) this;
        }

        public Criteria andStyleFourIsNull() {
            addCriterion("style_four is null");
            return (Criteria) this;
        }

        public Criteria andStyleFourIsNotNull() {
            addCriterion("style_four is not null");
            return (Criteria) this;
        }

        public Criteria andStyleFourEqualTo(String value) {
            addCriterion("style_four =", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourNotEqualTo(String value) {
            addCriterion("style_four <>", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourGreaterThan(String value) {
            addCriterion("style_four >", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourGreaterThanOrEqualTo(String value) {
            addCriterion("style_four >=", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourLessThan(String value) {
            addCriterion("style_four <", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourLessThanOrEqualTo(String value) {
            addCriterion("style_four <=", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourLike(String value) {
            addCriterion("style_four like", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourNotLike(String value) {
            addCriterion("style_four not like", value, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourIn(List<String> values) {
            addCriterion("style_four in", values, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourNotIn(List<String> values) {
            addCriterion("style_four not in", values, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourBetween(String value1, String value2) {
            addCriterion("style_four between", value1, value2, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFourNotBetween(String value1, String value2) {
            addCriterion("style_four not between", value1, value2, "styleFour");
            return (Criteria) this;
        }

        public Criteria andStyleFiveIsNull() {
            addCriterion("style_five is null");
            return (Criteria) this;
        }

        public Criteria andStyleFiveIsNotNull() {
            addCriterion("style_five is not null");
            return (Criteria) this;
        }

        public Criteria andStyleFiveEqualTo(String value) {
            addCriterion("style_five =", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveNotEqualTo(String value) {
            addCriterion("style_five <>", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveGreaterThan(String value) {
            addCriterion("style_five >", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveGreaterThanOrEqualTo(String value) {
            addCriterion("style_five >=", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveLessThan(String value) {
            addCriterion("style_five <", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveLessThanOrEqualTo(String value) {
            addCriterion("style_five <=", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveLike(String value) {
            addCriterion("style_five like", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveNotLike(String value) {
            addCriterion("style_five not like", value, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveIn(List<String> values) {
            addCriterion("style_five in", values, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveNotIn(List<String> values) {
            addCriterion("style_five not in", values, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveBetween(String value1, String value2) {
            addCriterion("style_five between", value1, value2, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleFiveNotBetween(String value1, String value2) {
            addCriterion("style_five not between", value1, value2, "styleFive");
            return (Criteria) this;
        }

        public Criteria andStyleSixIsNull() {
            addCriterion("style_six is null");
            return (Criteria) this;
        }

        public Criteria andStyleSixIsNotNull() {
            addCriterion("style_six is not null");
            return (Criteria) this;
        }

        public Criteria andStyleSixEqualTo(String value) {
            addCriterion("style_six =", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixNotEqualTo(String value) {
            addCriterion("style_six <>", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixGreaterThan(String value) {
            addCriterion("style_six >", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixGreaterThanOrEqualTo(String value) {
            addCriterion("style_six >=", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixLessThan(String value) {
            addCriterion("style_six <", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixLessThanOrEqualTo(String value) {
            addCriterion("style_six <=", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixLike(String value) {
            addCriterion("style_six like", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixNotLike(String value) {
            addCriterion("style_six not like", value, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixIn(List<String> values) {
            addCriterion("style_six in", values, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixNotIn(List<String> values) {
            addCriterion("style_six not in", values, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixBetween(String value1, String value2) {
            addCriterion("style_six between", value1, value2, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSixNotBetween(String value1, String value2) {
            addCriterion("style_six not between", value1, value2, "styleSix");
            return (Criteria) this;
        }

        public Criteria andStyleSevenIsNull() {
            addCriterion("style_seven is null");
            return (Criteria) this;
        }

        public Criteria andStyleSevenIsNotNull() {
            addCriterion("style_seven is not null");
            return (Criteria) this;
        }

        public Criteria andStyleSevenEqualTo(String value) {
            addCriterion("style_seven =", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenNotEqualTo(String value) {
            addCriterion("style_seven <>", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenGreaterThan(String value) {
            addCriterion("style_seven >", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenGreaterThanOrEqualTo(String value) {
            addCriterion("style_seven >=", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenLessThan(String value) {
            addCriterion("style_seven <", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenLessThanOrEqualTo(String value) {
            addCriterion("style_seven <=", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenLike(String value) {
            addCriterion("style_seven like", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenNotLike(String value) {
            addCriterion("style_seven not like", value, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenIn(List<String> values) {
            addCriterion("style_seven in", values, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenNotIn(List<String> values) {
            addCriterion("style_seven not in", values, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenBetween(String value1, String value2) {
            addCriterion("style_seven between", value1, value2, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleSevenNotBetween(String value1, String value2) {
            addCriterion("style_seven not between", value1, value2, "styleSeven");
            return (Criteria) this;
        }

        public Criteria andStyleEightIsNull() {
            addCriterion("style_eight is null");
            return (Criteria) this;
        }

        public Criteria andStyleEightIsNotNull() {
            addCriterion("style_eight is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEightEqualTo(String value) {
            addCriterion("style_eight =", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightNotEqualTo(String value) {
            addCriterion("style_eight <>", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightGreaterThan(String value) {
            addCriterion("style_eight >", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightGreaterThanOrEqualTo(String value) {
            addCriterion("style_eight >=", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightLessThan(String value) {
            addCriterion("style_eight <", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightLessThanOrEqualTo(String value) {
            addCriterion("style_eight <=", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightLike(String value) {
            addCriterion("style_eight like", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightNotLike(String value) {
            addCriterion("style_eight not like", value, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightIn(List<String> values) {
            addCriterion("style_eight in", values, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightNotIn(List<String> values) {
            addCriterion("style_eight not in", values, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightBetween(String value1, String value2) {
            addCriterion("style_eight between", value1, value2, "styleEight");
            return (Criteria) this;
        }

        public Criteria andStyleEightNotBetween(String value1, String value2) {
            addCriterion("style_eight not between", value1, value2, "styleEight");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBlockTimeIsNull() {
            addCriterion("block_time is null");
            return (Criteria) this;
        }

        public Criteria andBlockTimeIsNotNull() {
            addCriterion("block_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlockTimeEqualTo(Date value) {
            addCriterion("block_time =", value, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeNotEqualTo(Date value) {
            addCriterion("block_time <>", value, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeGreaterThan(Date value) {
            addCriterion("block_time >", value, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("block_time >=", value, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeLessThan(Date value) {
            addCriterion("block_time <", value, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("block_time <=", value, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeIn(List<Date> values) {
            addCriterion("block_time in", values, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeNotIn(List<Date> values) {
            addCriterion("block_time not in", values, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeBetween(Date value1, Date value2) {
            addCriterion("block_time between", value1, value2, "blockTime");
            return (Criteria) this;
        }

        public Criteria andBlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("block_time not between", value1, value2, "blockTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * goods
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * goods 2017-12-13
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public static class SelectiveField {
        private Set<String> fields;

        private static String allFields = "id,goods_code,goods_name,goods_en_name,main_img_url,category_one_id,category_two_id,category_three_id,category_four_id,brand_id,cost_price,weight,specification,model,material,is_production,manager_id,manager_name,purchase_link,same_purchase_link,style_id,style_one,style_two,style_three,style_four,style_five,style_six,style_seven,style_eight,goods_type,status,block_time,creator,create_time,modifier,modify_time";

        private SelectiveField() {
            fields = new HashSet<>();
        }

        public static SelectiveField select() {
            return new SelectiveField();
        }

        public SelectiveField id() {
            fields.add("id");
            return this;
        }

        public SelectiveField goodsCode() {
            fields.add("goods_code");
            return this;
        }

        public SelectiveField goodsName() {
            fields.add("goods_name");
            return this;
        }

        public SelectiveField goodsEnName() {
            fields.add("goods_en_name");
            return this;
        }

        public SelectiveField mainImgUrl() {
            fields.add("main_img_url");
            return this;
        }

        public SelectiveField categoryOneId() {
            fields.add("category_one_id");
            return this;
        }

        public SelectiveField categoryTwoId() {
            fields.add("category_two_id");
            return this;
        }

        public SelectiveField categoryThreeId() {
            fields.add("category_three_id");
            return this;
        }

        public SelectiveField categoryFourId() {
            fields.add("category_four_id");
            return this;
        }

        public SelectiveField brandId() {
            fields.add("brand_id");
            return this;
        }

        public SelectiveField costPrice() {
            fields.add("cost_price");
            return this;
        }

        public SelectiveField weight() {
            fields.add("weight");
            return this;
        }

        public SelectiveField specification() {
            fields.add("specification");
            return this;
        }

        public SelectiveField model() {
            fields.add("model");
            return this;
        }

        public SelectiveField material() {
            fields.add("material");
            return this;
        }

        public SelectiveField isProduction() {
            fields.add("is_production");
            return this;
        }

        public SelectiveField managerId() {
            fields.add("manager_id");
            return this;
        }

        public SelectiveField managerName() {
            fields.add("manager_name");
            return this;
        }

        public SelectiveField purchaseLink() {
            fields.add("purchase_link");
            return this;
        }

        public SelectiveField samePurchaseLink() {
            fields.add("same_purchase_link");
            return this;
        }

        public SelectiveField styleId() {
            fields.add("style_id");
            return this;
        }

        public SelectiveField styleOne() {
            fields.add("style_one");
            return this;
        }

        public SelectiveField styleTwo() {
            fields.add("style_two");
            return this;
        }

        public SelectiveField styleThree() {
            fields.add("style_three");
            return this;
        }

        public SelectiveField styleFour() {
            fields.add("style_four");
            return this;
        }

        public SelectiveField styleFive() {
            fields.add("style_five");
            return this;
        }

        public SelectiveField styleSix() {
            fields.add("style_six");
            return this;
        }

        public SelectiveField styleSeven() {
            fields.add("style_seven");
            return this;
        }

        public SelectiveField styleEight() {
            fields.add("style_eight");
            return this;
        }

        public SelectiveField goodsType() {
            fields.add("goods_type");
            return this;
        }

        public SelectiveField status() {
            fields.add("status");
            return this;
        }

        public SelectiveField blockTime() {
            fields.add("block_time");
            return this;
        }

        public SelectiveField creator() {
            fields.add("creator");
            return this;
        }

        public SelectiveField createTime() {
            fields.add("create_time");
            return this;
        }

        public SelectiveField modifier() {
            fields.add("modifier");
            return this;
        }

        public SelectiveField modifyTime() {
            fields.add("modify_time");
            return this;
        }

        @Override
        public String toString() {
            if(fields.isEmpty()) return allFields;
            StringBuilder sb = new StringBuilder();
            char seperator = ',';
            Iterator<String> fieldInterator = fields.iterator();
            int i = 0;
            while(fieldInterator.hasNext()){
                if(i>0) sb.append(seperator);
                sb.append(fieldInterator.next());
                i++;
            }
            return sb.toString();
        }
    }
}