Feature: Google Search

  Rule: Google Search results must contain a video section when applicable

      Example: When Sibasish searches for a specific query string they should be able to see the video section in search results

        Given Sibasish is able to open the Google homepage
        When Sibasish searches for "UI Automation using Serenity"
        Then they should see the "Videos" section
        And they should be able to verify that the videos are relevant to "Serenity"