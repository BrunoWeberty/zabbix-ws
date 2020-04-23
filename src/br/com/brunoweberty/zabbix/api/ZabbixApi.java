package br.com.brunoweberty.zabbix.api;

import com.alibaba.fastjson.JSONObject;

import br.com.brunoweberty.zabbix.api.Request;

public interface ZabbixApi {

	public void init();

	public void destroy();

	public String apiVersion();

	public JSONObject call(Request request);

	public boolean login(String user, String password);
}
