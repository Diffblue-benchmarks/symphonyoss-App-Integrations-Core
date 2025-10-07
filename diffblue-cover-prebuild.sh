#!/usr/bin/env bash

set -eou pipefail

function clone_and_build_project {
  local project="$1"
  git clone --depth 1 --single-branch --branch "dev" "https://github.com/Diffblue-benchmarks/${project}.git"
  cd "$project"
  mvn clean install -ntp -DskipTests -T1C
  cd ..
  rm -rf "$project"
}

rm -rf "prebuild"
mkdir "prebuild"
cd "prebuild"
sudo apt install -y libpng-dev
clone_and_build_project "symphonyoss-App-Integrations-Commons"
clone_and_build_project "symphonyoss-App-Integrations-Jira"
clone_and_build_project "symphonyoss-App-Integrations-Github"
clone_and_build_project "symphonyoss-App-Integrations-Universal"
clone_and_build_project "symphonyoss-App-Integrations-Zapier"

cd ..
rm -rf "prebuild"
