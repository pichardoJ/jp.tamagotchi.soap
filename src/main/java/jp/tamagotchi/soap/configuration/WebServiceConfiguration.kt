@file:Suppress("unused")

package jp.tamagotchi.soap.configuration

import jp.tamagotchi.soap.endpoints.PetEndpoint
import jp.tamagotchi.soap.endpoints.TransactionEndpoint
import jp.tamagotchi.soap.endpoints.UserEndpoint

import org.springframework.boot.web.servlet.ServletRegistrationBean

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

import org.springframework.core.io.ClassPathResource

import org.springframework.ws.config.annotation.EnableWs
import org.springframework.ws.config.annotation.WsConfigurerAdapter
import org.springframework.ws.server.EndpointAdapter
import org.springframework.ws.server.endpoint.adapter.MessageEndpointAdapter

import org.springframework.ws.transport.http.MessageDispatcherServlet

import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition

import org.springframework.xml.xsd.SimpleXsdSchema
import org.springframework.xml.xsd.XsdSchema

/**
 * @author J. Pichardo
 */
@EnableWs
@Configuration
@ComponentScan("jp.tamagotchi.soap")
open class WebServiceConfiguration : WsConfigurerAdapter() {

    @Bean
    open fun messageDispatcherServlet(applicationContext: ApplicationContext) =
            MessageDispatcherServlet().run {
                setApplicationContext(applicationContext)
                isTransformWsdlLocations = true
                ServletRegistrationBean(this, "/v1/pets/*", "/v1/users/*", "/v1/transactions/*")
            }

    //region Pets
    @Bean(name = ["pets"])
    open fun petsWsdl11Definition(petsSchema: XsdSchema) =
            DefaultWsdl11Definition().apply {
                setPortTypeName("PetsPort")
                setLocationUri("/v1/pets")
                setTargetNamespace(PetEndpoint.NAMESPACE_URI)
                setSchema(petsSchema)
            }

    @Bean
    open fun petsSchema(): XsdSchema = SimpleXsdSchema(ClassPathResource("pets.xsd"))
    //endregion

    //region Transactions
    @Bean(name = ["transactions"])
    open fun transactionsWsdl11Definition(transactionsSchema: XsdSchema) =
            DefaultWsdl11Definition().apply {
                setPortTypeName("TransactionsPort")
                setLocationUri("/v1/transactions")
                setTargetNamespace(TransactionEndpoint.NAMESPACE_URI)
                setSchema(transactionsSchema)
            }

    @Bean
    open fun transactionsSchema(): XsdSchema = SimpleXsdSchema(ClassPathResource("transactions.xsd"))
    //endregion

    //region Users
    @Bean(name = ["users"])
    open fun usersWsdl11Definition(usersSchema: XsdSchema) =
            DefaultWsdl11Definition().apply {
                setPortTypeName("UsersPort")
                setLocationUri("/v1/users")
                setTargetNamespace(UserEndpoint.NAMESPACE_URI)
                setSchema(usersSchema)
            }

    @Bean
    open fun usersSchema(): XsdSchema = SimpleXsdSchema(ClassPathResource("users.xsd"))
    //endregion

    @Bean
    open fun messageEndpointAdapter(): EndpointAdapter = MessageEndpointAdapter()

}
