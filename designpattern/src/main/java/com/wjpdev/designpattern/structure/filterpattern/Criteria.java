package com.wjpdev.designpattern.structure.filterpattern;

/**
 * Created by wjpdeveloper on 2017/7/7.
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}