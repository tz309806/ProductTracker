import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class ActorRowMapper implements RowMapper<ActorTableSample> {
    @Override
    public ActorTableSample mapRow(ResultSet row, int rowNum) throws SQLException {
        ActorTableSample actor = new ActorTableSample();
        actor.setArticleId(row.getInt("articleId"));
        actor.setTitle(row.getString("title"));
        actor.setCategory(row.getString("category"));
        return actor;
    }
}