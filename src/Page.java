/**
 * Created with IntelliJ IDEA.
 * User: zhuyubin
 * Date: 2017/12/13 0013
 * Time: 19:12
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class Page {
    public final static int DEFAULT_PAGE_SIZE = 10;

    private Integer pageNo;

    private Integer pageSize;

    private Long total;

    private Integer offset;

    public Page(Integer pageNo, Integer pageSize, Long total) {
        this.pageNo = pageNo > 0 ? pageNo : 1;

        this.total = total;

        if(pageSize != null && pageSize > 0) {
            this.pageSize = pageSize;
        } else {
            this.pageSize = DEFAULT_PAGE_SIZE;
        }
        this.offset = (this.pageNo - 1) * this.pageSize;
    }
}