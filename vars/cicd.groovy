 def gitdownload(repo)
 {
  git "https://github.com/sudarshansw7/${repo}.git"
 } 


def buildartifact()
{
 sh'mvn package'
}


def deploytoTomcat(jobname,ipaddress,context)
{
 sh "scp /var/lib/jenkins/workspace/sharedlibreries/target/helloworld.war ubuntu@172.31.16.164:/var/lib/tomcat10/webapps/newtest.war"
}
