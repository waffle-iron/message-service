package de.extremeenvironment.messageservice.service;

import de.extremeenvironment.messageservice.domain.Message;
import de.extremeenvironment.messageservice.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Message.
 */
@Service
@Transactional
public class MessageService {

    private final Logger log = LoggerFactory.getLogger(MessageService.class);
    
    @Inject
    private MessageRepository messageRepository;
    
    /**
     * Save a message.
     * 
     * @param message the entity to save
     * @return the persisted entity
     */
    public Message save(Message message) {
        log.debug("Request to save Message : {}", message);
        Message result = messageRepository.save(message);
        return result;
    }

    /**
     *  Get all the messages.
     *  
     *  @return the list of entities
     */
    @Transactional(readOnly = true) 
    public List<Message> findAll() {
        log.debug("Request to get all Messages");
        List<Message> result = messageRepository.findAll();
        return result;
    }

    /**
     *  Get one message by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Transactional(readOnly = true) 
    public Message findOne(Long id) {
        log.debug("Request to get Message : {}", id);
        Message message = messageRepository.findOne(id);
        return message;
    }

    /**
     *  Delete the  message by id.
     *  
     *  @param id the id of the entity
     */
    public void delete(Long id) {
        log.debug("Request to delete Message : {}", id);
        messageRepository.delete(id);
    }
}
