import java.sql.ResultSet;
import java.sql.SQLException;

import main.models.ActorTableSample;
import org.springframework.jdbc.core.RowMapper;
public class ActorRowMapper implements RowMapper<ActorTableSample> {
    @Override
    public ActorTableSample mapRow(ResultSet row, int rowNum) throws SQLException {
        ActorTableSample actor = new ActorTableSample();
        actor.setActorId(row.getInt("actor_id"));
        actor.setFirstName(row.getString("first_name"));
        actor.setLastName(row.getString("last_name"));
        actor.setLastUpdated(row.getDate("last_updated"));
        return actor;
    }
}