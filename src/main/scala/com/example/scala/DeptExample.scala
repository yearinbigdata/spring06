package com.example.scala

import com.example.model.Dept
import org.apache.commons.logging.LogFactory

object DeptExample {
	
	var log = LogFactory.getLog(getClass)
	def main(args: Array[String]): Unit = {
		log.info("#####")
		log.info("하기싫다")
		log.info("#####")
		
		var dept1 = new Dept
		dept1.setDeptno(10)
		dept1.setDname("총무부")
		dept1.setLoc("서울")
		
		var dept2 = new Dept(20, "개발부", "부산")
		
		println(dept1)
		println(dept2)
	}
}