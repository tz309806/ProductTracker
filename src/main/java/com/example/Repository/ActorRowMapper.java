package Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.models.ActorTableSample;
import org.springframework.jdbc.core.RowMapper;
public class ActorRowMapper implements RowMapper<ActorTableSample> {
    @Override
    public ActorTableSample mapRow(ResultSet row, int rowNum) throws SQLException {


        ActorTableSample actor = new ActorTableSample(
                row.getString("first_name"),
                row.getString("last_name"),
                row.getDate("last_updated")
        );

        return actor;
    }

}



