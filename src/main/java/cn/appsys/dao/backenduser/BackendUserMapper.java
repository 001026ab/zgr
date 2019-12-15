package cn.appsys.dao.backenduser;
import org.apache.ibatis.annotations.Param;
import cn.appsys.pojo.BackendUser;
import org.springframework.stereotype.Repository;

@Repository
public interface BackendUserMapper {

	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public BackendUser getLoginUser(@Param("userCode") String userCode)throws Exception;

}
