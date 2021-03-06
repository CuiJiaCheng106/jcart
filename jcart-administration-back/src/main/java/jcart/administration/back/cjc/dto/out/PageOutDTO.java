package jcart.administration.back.cjc.dto.out;


import java.util.List;

/**
 * @Author CuiJiaCheng
 * @Description
 * @create 2020-02-25 13:43
 **/
public class PageOutDTO<T> {
    private Integer total;
    private Integer pageSize;
    private Integer pageNum;
    private List<T> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
