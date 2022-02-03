.class Lcom/digdroid/alman/dig/p3$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p3$f;->a([Lcom/digdroid/alman/dig/a4;)Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/regex/Pattern;

.field final synthetic b:Lcom/digdroid/alman/dig/p3$f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p3$f;Ljava/util/regex/Pattern;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$f$a;->b:Lcom/digdroid/alman/dig/p3$f;

    iput-object p2, p0, Lcom/digdroid/alman/dig/p3$f$a;->a:Ljava/util/regex/Pattern;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/p3$f$a;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "___tmp.cfg"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
