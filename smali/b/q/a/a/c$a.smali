.class public final Lb/q/a/a/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/q/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Landroid/content/ContentValues;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lb/q/a/a/c$a;->a:Landroid/content/ContentValues;

    return-void
.end method


# virtual methods
.method public a()Lb/q/a/a/c;
    .locals 1

    new-instance v0, Lb/q/a/a/c;

    invoke-direct {v0, p0}, Lb/q/a/a/c;-><init>(Lb/q/a/a/c$a;)V

    return-object v0
.end method

.method public b(Landroid/content/Intent;)Lb/q/a/a/c$a;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb/q/a/a/c$a;->c(Landroid/net/Uri;)Lb/q/a/a/c$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;)Lb/q/a/a/c$a;
    .locals 2

    iget-object v0, p0, Lb/q/a/a/c$a;->a:Landroid/content/ContentValues;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const-string v1, "app_link_intent_uri"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lb/q/a/a/c$a;
    .locals 2

    iget-object v0, p0, Lb/q/a/a/c$a;->a:Landroid/content/ContentValues;

    const-string v1, "display_name"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lb/q/a/a/c$a;
    .locals 2

    iget-object v0, p0, Lb/q/a/a/c$a;->a:Landroid/content/ContentValues;

    const-string v1, "type"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
