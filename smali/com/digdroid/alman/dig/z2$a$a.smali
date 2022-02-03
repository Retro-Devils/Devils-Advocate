.class Lcom/digdroid/alman/dig/z2$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/z2$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/z2$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/z2$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/z2$a$a;->a:Lcom/digdroid/alman/dig/z2$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/z2$a$a;->a:Lcom/digdroid/alman/dig/z2$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/z2$a;->c:Lcom/digdroid/alman/dig/z2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/z2;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    aget-object p1, p1, v1

    const-string v1, "scan_dir"

    invoke-static {v0, v1, p1}, Lcom/digdroid/alman/dig/DatabaseService;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
