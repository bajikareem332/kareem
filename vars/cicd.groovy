 def gitdownload(repo)
 {
  git "https://github.com/sudarshansw7/${repo}.git"
 } 


def buildartifact()
{
 sh'mvn package'
}


def deployTomcat(jobname,ipaddress,context)
{
 sh "scp /var/lib/jenkins/workspace/${jobname}/target/helloworld.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${context}.war"
}
