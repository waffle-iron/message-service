package de.extremeenvironment.messageservice.repository;

import de.extremeenvironment.messageservice.domain.Message;

import org.springframework.data.jpa.repository.*;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the Message entity.
 */
@SuppressWarnings("unused")
public interface MessageRepository extends JpaRepository<Message,Long> {

    public Optional<List<Message>> getMessages();



}
