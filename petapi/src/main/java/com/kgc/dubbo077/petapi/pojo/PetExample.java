package com.kgc.dubbo077.petapi.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andPetIdIsNull() {
            addCriterion("pet_id is null");
            return (Criteria) this;
        }

        public Criteria andPetIdIsNotNull() {
            addCriterion("pet_id is not null");
            return (Criteria) this;
        }

        public Criteria andPetIdEqualTo(Integer value) {
            addCriterion("pet_id =", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotEqualTo(Integer value) {
            addCriterion("pet_id <>", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThan(Integer value) {
            addCriterion("pet_id >", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_id >=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThan(Integer value) {
            addCriterion("pet_id <", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdLessThanOrEqualTo(Integer value) {
            addCriterion("pet_id <=", value, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdIn(List<Integer> values) {
            addCriterion("pet_id in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotIn(List<Integer> values) {
            addCriterion("pet_id not in", values, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdBetween(Integer value1, Integer value2) {
            addCriterion("pet_id between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_id not between", value1, value2, "petId");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNull() {
            addCriterion("pet_name is null");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNotNull() {
            addCriterion("pet_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetNameEqualTo(String value) {
            addCriterion("pet_name =", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotEqualTo(String value) {
            addCriterion("pet_name <>", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThan(String value) {
            addCriterion("pet_name >", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThanOrEqualTo(String value) {
            addCriterion("pet_name >=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThan(String value) {
            addCriterion("pet_name <", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThanOrEqualTo(String value) {
            addCriterion("pet_name <=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLike(String value) {
            addCriterion("pet_name like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotLike(String value) {
            addCriterion("pet_name not like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameIn(List<String> values) {
            addCriterion("pet_name in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotIn(List<String> values) {
            addCriterion("pet_name not in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameBetween(String value1, String value2) {
            addCriterion("pet_name between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotBetween(String value1, String value2) {
            addCriterion("pet_name not between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetBreadIsNull() {
            addCriterion("pet_bread is null");
            return (Criteria) this;
        }

        public Criteria andPetBreadIsNotNull() {
            addCriterion("pet_bread is not null");
            return (Criteria) this;
        }

        public Criteria andPetBreadEqualTo(String value) {
            addCriterion("pet_bread =", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadNotEqualTo(String value) {
            addCriterion("pet_bread <>", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadGreaterThan(String value) {
            addCriterion("pet_bread >", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadGreaterThanOrEqualTo(String value) {
            addCriterion("pet_bread >=", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadLessThan(String value) {
            addCriterion("pet_bread <", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadLessThanOrEqualTo(String value) {
            addCriterion("pet_bread <=", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadLike(String value) {
            addCriterion("pet_bread like", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadNotLike(String value) {
            addCriterion("pet_bread not like", value, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadIn(List<String> values) {
            addCriterion("pet_bread in", values, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadNotIn(List<String> values) {
            addCriterion("pet_bread not in", values, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadBetween(String value1, String value2) {
            addCriterion("pet_bread between", value1, value2, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetBreadNotBetween(String value1, String value2) {
            addCriterion("pet_bread not between", value1, value2, "petBread");
            return (Criteria) this;
        }

        public Criteria andPetSexIsNull() {
            addCriterion("pet_sex is null");
            return (Criteria) this;
        }

        public Criteria andPetSexIsNotNull() {
            addCriterion("pet_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPetSexEqualTo(String value) {
            addCriterion("pet_sex =", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotEqualTo(String value) {
            addCriterion("pet_sex <>", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexGreaterThan(String value) {
            addCriterion("pet_sex >", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexGreaterThanOrEqualTo(String value) {
            addCriterion("pet_sex >=", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLessThan(String value) {
            addCriterion("pet_sex <", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLessThanOrEqualTo(String value) {
            addCriterion("pet_sex <=", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLike(String value) {
            addCriterion("pet_sex like", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotLike(String value) {
            addCriterion("pet_sex not like", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexIn(List<String> values) {
            addCriterion("pet_sex in", values, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotIn(List<String> values) {
            addCriterion("pet_sex not in", values, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexBetween(String value1, String value2) {
            addCriterion("pet_sex between", value1, value2, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotBetween(String value1, String value2) {
            addCriterion("pet_sex not between", value1, value2, "petSex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}