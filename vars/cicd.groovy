 def gitdownload(repo)
 {
  git "https://github.com/sudarshansw7/${repo}.git"
 } 


def buildartifact()
{
 sh'mvn package'
}
