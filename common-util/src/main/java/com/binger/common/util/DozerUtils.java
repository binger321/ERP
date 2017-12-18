package com.binger.common.util;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * DozerUtils工具类，用于两个对象复制数据
 * Created by zhuyubin on 2017/12/13.
 */
public class DozerUtils {

    private static DozerBeanMapper mapper = new DozerBeanMapper();

    /**
     * 单个对象数据转换
     * @param source
     * @param destinationClass
     * @param <T>
     * @return
     */
    public static <T> T convert(Object source, Class<T> destinationClass) {
        return mapper.map(source, destinationClass);
    }

    /**
     * 列表数据转换
     * @param sourceList
     * @param destinationClass
     * @param <T>
     * @param <S>
     * @return
     */
    public static <T,S> List<T> convertList(List<S> sourceList, Class<T> destinationClass) {
        if(CollectionUtils.isNotEmpty(sourceList)){
            List<T> retList = new ArrayList<T>();
            for(S source : sourceList){
                retList.add(mapper.map(source, destinationClass));
            }
            return retList;
        }
        return null;
    }
}
