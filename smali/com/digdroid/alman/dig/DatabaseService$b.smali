.class Lcom/digdroid/alman/dig/DatabaseService$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FileFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/DatabaseService;->h(Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/regex/Pattern;

.field final synthetic b:Lcom/digdroid/alman/dig/DatabaseService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/DatabaseService;Ljava/util/regex/Pattern;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/DatabaseService$b;->b:Lcom/digdroid/alman/dig/DatabaseService;

    iput-object p2, p0, Lcom/digdroid/alman/dig/DatabaseService$b;->a:Ljava/util/regex/Pattern;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService$b;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
