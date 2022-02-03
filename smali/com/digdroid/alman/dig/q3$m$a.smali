.class Lcom/digdroid/alman/dig/q3$m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FilenameFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q3$m;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$m$a;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$m$a;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/q3;->n2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "image"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "video"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
