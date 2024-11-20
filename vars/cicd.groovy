 def gitdownload(repo)
 {
    git "https://github.com/sudarshansw7/${repo}.git"
 }

def buildArtifact()
{
    sh "mvn package"
}

def deploy(jobname,ip,context)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}

