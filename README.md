# ## MCP Server Integration with SpringBoot Java Application
This project to learning MCP server with springboot java application.
Application will use java 25 and springboot  AI for MCP integration

# ## Getting Started
Verify maven is installed in your system.
```bash
mvn -v
```
mvn clean install
```bash
./mvnw clean install
```
# ## MCP inspector Setup
install node js veriosn 18 or above using node install --> nvm install node
my challenges-->Using Mac big sur , nodejs version 18 which can be downloaded as 
 #Start inspector
```bash
npx @modelcontextprotocol/inspector
```
# open in browser and copy endpount url
Example: http://localhost:6274/?MCP_PROXY_AUTH_TOKEN=******
#connect from MCP inspector
TransportType: Streamable
Endpoint URL: http://localhost:8080/mcp
connection should be successful
# Verify MCP tool and resouces
Click on Resources tab and verify resources are listed by clicking list
Click Tool tabl and verify tools are listed by clicking list
# ## Refference Documentation
MCP inspector and server documentation: https://modelcontextprotocol.io/docs/tools/inspector#typescript
Springboot AI documentation: https://docs.spring.io/spring-ai/reference/api/mcp/mcp-server-boot-starter-docs.html
MCP architecture : https://modelcontextprotocol.io/docs/learn/architecture
Learning resources: https://learn.deeplearning.ai/courses/mcp-build-rich-context-ai-apps-with-anthropic/lesson/k0f9c/connecting-the-mcp-chatbot-to-reference-servers
# Run tools
Select one of tool from list and run