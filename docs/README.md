# Adding a new language
Inspired by https://ignek.com/blog/add-custom-language-support-to-liferay-7  

## Where to find available languages
- https://github.com/liferay/liferay-portal/tree/master/portal-impl/src/content

## Where to find language codes
- https://docs.oracle.com/cd/E23824_01/html/E26033/glset.html


## Steps
1. Modify web.xml
```xml
...
<servlet-mapping>
    <servlet-name>I18n Servlet</servlet-name>
    <url-pattern>/gu/*</url-pattern>
</servlet-mapping>
<servlet-mapping>
    <servlet-name>I18n Servlet</servlet-name>
    <url-pattern>/gu_IN/*</url-pattern>
</servlet-mapping>
<security-constraint>
    <web-resource-collection>
        <web-resource-name>/c/portal/protected</web-resource-name>
        <url-pattern>/gu/c/portal/protected</url-pattern>
        <url-pattern>/gu_IN/c/portal/protected</url-pattern>
    </web-resource-collection>
</security-constraint>    
...
```
2. portal-ext.properties
```properties
locales=en,nl_NL,es_ES,sv_SE,tr_TR,uk_UA,vi_VN,gu_IN
```

3. Make current  
You have to make the new local added to the list of current locales  
Goto `control panel` --> `configuration` --> `instance settings`  

4. Deploy custom-language module and checkout the sign-in portlet