package com.app.dao;

import com.app.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TicketsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewTicket(Ticket ticket) {
        jdbcTemplate.update("INSERT INTO tickets (summary, description, reporter_id, project_id) " +
                "VALUES (?, ?, ?, ?)", ticket.getSummary(), ticket.getDescription(),
                ticket.getReporterId(), ticket.getProjectId());
    }
}
