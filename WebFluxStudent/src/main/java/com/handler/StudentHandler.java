package com.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;


import com.model.Student;
import com.repo.StudentReactiveRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Sinks;

@Component
public class StudentHandler {
	private StudentReactiveRepository repo;
	
	@Autowired
	public StudentHandler(StudentReactiveRepository repo) {
		this.repo = repo;
	}
	
	static Mono<ServerResponse> notFoundMono = ServerResponse.notFound().build();
	Sinks.Many<Student> studentSink = Sinks.many().replay().latest();
	
	public Mono<ServerResponse> addStudent(ServerRequest serverRequest){
		return null;
	}
	
	public Mono<ServerResponse> getStudent(ServerRequest serverRequest){
		return null;
	}
	
	public Mono<ServerResponse> updateStudent(ServerRequest serverRequest){
		return null;
	}
	
	public Mono<ServerResponse> deleteStudent(ServerRequest serverRequest){
		var studentId = serverRequest.pathVariable("studentId");
		return null;
	}
	
	public Mono<ServerResponse> getStudentStream(ServerRequest serverRequest){
		return null;
	}

	private Mono<ServerResponse> buildStudentResponse(Flux<Student> students) {
		return ServerResponse.ok().body(students, Student.class);
	}
}
