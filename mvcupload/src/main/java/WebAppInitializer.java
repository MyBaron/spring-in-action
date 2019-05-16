import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.*;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
//        将DispatcherServlet 映射到 "/"
        return new String[]{"/"};
    }

    //上传保持目录
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //String location 临时文件地址, long maxFileSize 上传文件的最大容量,
        //long maxRequestSize 请求的最大容量, int fileSizeThreshold 上传过程中，如果文件到达最大容量，会写入到临时文件夹中
        registration.setMultipartConfig(new MultipartConfigElement("E:\\code\\baron\\spring-in-action\\mvcupload\\src\\main\\webapp\\fileTemp",2097152,2097152,0));
    }

    //注册组件
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

    //注册filter
    @Override
    protected Filter[] getServletFilters() {
        return super.getServletFilters();
    }
}
