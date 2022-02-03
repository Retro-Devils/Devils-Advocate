.class Lc/a/a/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/a/a/n;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Lc/a/a/n;


# direct methods
.method constructor <init>(Lc/a/a/n;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lc/a/a/n$a;->d:Lc/a/a/n;

    iput-object p2, p0, Lc/a/a/n$a;->b:Ljava/lang/String;

    iput-wide p3, p0, Lc/a/a/n$a;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lc/a/a/n$a;->d:Lc/a/a/n;

    invoke-static {v0}, Lc/a/a/n;->a(Lc/a/a/n;)Lc/a/a/v$a;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/n$a;->b:Ljava/lang/String;

    iget-wide v2, p0, Lc/a/a/n$a;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lc/a/a/v$a;->a(Ljava/lang/String;J)V

    iget-object v0, p0, Lc/a/a/n$a;->d:Lc/a/a/n;

    invoke-static {v0}, Lc/a/a/n;->a(Lc/a/a/n;)Lc/a/a/v$a;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/n$a;->d:Lc/a/a/n;

    invoke-virtual {v1}, Lc/a/a/n;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/a/a/v$a;->b(Ljava/lang/String;)V

    return-void
.end method
