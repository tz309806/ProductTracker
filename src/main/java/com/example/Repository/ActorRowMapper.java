//package com.example.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.example.models.ActorTableSample;
//import org.springframework.jdbc.core.RowMapper;
//public class ActorRowMapper implements RowMapper<ActorTableSample> {
//    @Override
//    public ActorTableSample mapRow(ResultSet row, int rowNum) throws SQLException {
//
//
//        ActorTableSample actor = new ActorTableSample(
//                "first_name",
//                "last_name",
//                "last_updated"
//        );
//
//        return actor;
//    }
//
//}
//
//
//
