
package com.stock.microservices.dbservice.sersives;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.stock.microservices.dbservice.model.Ticker;
import com.stock.microservices.dbservice.repository.TickerRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/ticker")
public class TickerService {

    private final TickerRepository tickerRepository;

    public TickerService( TickerRepository tickerRepository ){
        this.tickerRepository = tickerRepository;
    }
    @GetMapping
    public ResponseEntity<List<Ticker>> findAll(){
        return ResponseEntity.ok(this.tickerRepository.findAll());
    }
    @PostMapping
    public ResponseEntity<Ticker> create(@Valid @RequestBody Ticker ticker){
        return ResponseEntity.ok(this.tickerRepository.save(ticker));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ticker> findById(@PathVariable int id ){
        Optional<Ticker> ticker = this.tickerRepository.findById(id);
        if( !ticker.isPresent()){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(ticker.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ticker> update(@RequestBody Ticker ticker){
        
        Optional<Ticker> tickerOp = this.tickerRepository.findById(ticker.getId());
        if(!tickerOp.isPresent()){
            return ResponseEntity.badRequest().build();
        }
        this.tickerRepository.save(ticker);
        return ResponseEntity.ok(this.tickerRepository.findById(Integer.valueOf(ticker.getId())).get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Ticker> deleteById(@PathVariable int id){

        Optional<Ticker> tickerOp = this.tickerRepository.findById(id);
        if(!tickerOp.isPresent()){
            ResponseEntity.badRequest().build();
        }
        this.tickerRepository.deleteById(id);

        return ResponseEntity.ok(tickerOp.get());
    }
}