package sample.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.spring.interceptor.SampleInterceptor;

@Configuration
public class BeanConfiguration {

    @Bean
    public SampleInterceptor sampleInterceptor() {
        return new SampleInterceptor();
    }

    // @Bean
    // public HogeInterceptor hogeInterceptor() {
    //     return new HogeInterceptor();
    // }

    // @Override
    // public void addInterceptors(InterceptorRegistry registry) {
    //     registry.addInterceptor(sampleInterceptor())
    //             .addPathPatterns("/sample"); // ここで対象を指定している

    //     // 複数の Interceptor を指定したければ並べて書く。チェインして複数パスの指定も OK
    //     registry.addInterceptor(hogeInterceptor())
    //             .addPathPatterns("/hoge").addPathPatterns("/huga")
    //     // 異なる Interceptor で同じパスを指定すると、両方の afterCompletion() が実行される
    //     // 実行順序がどう決められるかは未調査
    //             .addPathPatterns("/sample");

    // }
    
}