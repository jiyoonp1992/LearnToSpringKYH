package hello.hellospring.repository;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;


import hello.hellospring.domain.Member;

public class JdbcMemberRepository implements MemberRepository{
	
	private final DataSource dataSource;
	
	public JdbcMemberRepository(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Member save(Member member) {
		// TODO Auto-generated method stub
		String sql = "insert into member(name) values(?)";
		
		Connection connection = dataSource.getConnection();
		
		connection.prepareStatement(sql );
		return null;
	}

	@Override
	public Optional<Member> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
