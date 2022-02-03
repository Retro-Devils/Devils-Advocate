.class Lcom/digdroid/alman/dig/t1$a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/h3$o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t1$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a$b;->a:Lcom/digdroid/alman/dig/t1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$b;->a:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    return-void
.end method
