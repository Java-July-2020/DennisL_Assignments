package com.dennislee.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dennislee.lookify.models.Lookify;
import com.dennislee.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	
	private LookifyRepository lRepo;
	
	public LookifyService(LookifyRepository repo) {
		this.lRepo = repo;
	}
	
	public Lookify getSong(Long id) {
		Lookify set = this.lRepo.findById(id).orElse(null);
		return set;
	}
	
	public List<Lookify> getAllSong(){
		return lRepo.findAll();
	}
	
	public Lookify createSong(Lookify song) {
		return this.lRepo.save(song);
	}

	public Lookify createSong(String title, String artist, Integer rating) {
		Lookify newSong = new Lookify(title, artist, rating);
		return this.lRepo.save(newSong);
	}
	
	public void deleteSong(Long id) {
		this.lRepo.deleteById(id);
	}
	
	public Lookify updateSong(Long id, Lookify updateSong) {
		return this.lRepo.save(updateSong);
	}
	
	public List<Lookify> findArtistSongs(String artist) {
		return this.lRepo.findByArtistContaining(artist);
	}
	
	public List<Lookify> findTopTen(){
		return this.lRepo.findTop10ByOrderByRatingDesc();
	}

}
