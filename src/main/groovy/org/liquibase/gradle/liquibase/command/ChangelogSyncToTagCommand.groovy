/*
 * Copyright 2011-2022 Tim Berglund and Steven C. Saliman
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.  See the License for the specific language governing permissions and limitations
 * under the License.
 */

package org.liquibase.gradle.liquibase.command


import org.liquibase.gradle.LiquibaseCommand

/**
 * This class represents the changelog-sync-to-tag command.
 *
 * @author Steven C. Saliman
 */
class ChangelogSyncToTagCommand extends LiquibaseCommand {

    ChangelogSyncToTagCommand() {
        description =  'Mark all undeployed changesets up to and including the <liquibaseCommandValue> tag as executed in your database.'
        command =  'changelog-sync-to-tag'
        legacyCommand =  'changelogSyncToTag'
        requiresValue =  true
        valueArgument =  TAG
        commandArguments = [
                CHANGELOG_FILE,
                URL_ARG,
                DEFAULT_SCHEMA_NAME,
                DEFAULT_CATALOG_NAME,
                USERNAME,
                PASSWORD,
                LABEL_FILTER,
                LABELS,
                CONTEXTS,
                TAG,
                DRIVER,
                DRIVER_PROPERTIES_FILE
        ]
    }
}
