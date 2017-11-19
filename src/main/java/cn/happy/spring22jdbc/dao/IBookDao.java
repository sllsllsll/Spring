package cn.happy.spring22jdbc.dao;

        import cn.happy.spring22jdbc.entity.Book;

        import java.util.List;

/**
 * Created by linlin on 2017/8/2.
 */
public interface IBookDao {
    public List<Book> getList();
}
